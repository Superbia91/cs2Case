package net.superbia.caseopener.client.screen;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;

import net.superbia.caseopener.common.cases.CaseType;
import net.superbia.caseopener.loot.CaseLootRegistry;
import net.superbia.caseopener.loot.DropEntry;
import net.superbia.caseopener.loot.DropRoller;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CaseOpenScreen extends Screen {
    // TODO: заменить на нормальный translation key (пример: screen.caseopener.case_open)
    // NOTE: сейчас это не ключ локализации, а просто текст

    public static final Component TITLE = Component.translatable("Case Oppend");
    private final CaseType caseType;

    // каждый отрисованый предмет
    private int oneItem;




    //создание списка рола
    private List<ItemStack> reel;

    // размеры GUI области (фиксированные)
    private static final int IMAGE_WIDTH = 256;
    private static final int IMAGE_HEIGHT = 166;

    //переменная тиков
    private  int ticks = 0;

    //флаг завершения
    private  boolean finished;


    //переменная/флаг, как только true закрывается экран
    private boolean closed;


    // переменные для настройки прокрутка ленты
    private int speed;
    private double offset;

    // переменные для положения ленты
    private int baseX;
    private int baseY;

    //переменная для замедления
    private int spacing;

    // позиция GUI относительно экрана
    private int leftPos;
    private int topPos;



        @Override
        protected void init(){
            super.init();
            //переменные для начала старта
            int startX = (leftPos + 20);
            int startY = (topPos + 80);


            // переменная для получения пула
            List<DropEntry> pool = CaseLootRegistry.giveMeAPoolByCaseType(caseType);


            // инициализация списка дропа/линии прокрутка
            this.reel =  new ArrayList<>();

            //добавление предметов в список
            int sizeReel = 10;
            for (int i = 0; i < sizeReel; i++){
                DropEntry entry = DropRoller.giveDropRoll(pool);

                reel.add(new ItemStack(entry.item.get()));

            }

            // центрируем GUI по экрану

            this.leftPos = (this.width - IMAGE_WIDTH) / 2;
            this.topPos = (this.height - IMAGE_HEIGHT) / 2;
        }
    //запускаем тики
    @Override
    public void tick() {
        super.tick();
        //каждый раз добавляем тики
        ticks++;

        //проверка для себя
        System.out.println(ticks);
        // закрываем экран после 6 секунд и флаг на true
        if(!closed && ticks> 120){
            closed = true;
            if(this.minecraft != null){

                this.minecraft.setScreen(null);
            }
            System.out.println(closed);
            System.out.println("reel size = " + reel.size());



            }


    }


    // TODO: сюда позже добавить инициализацию анимации / списка предметов

        @Override
        public void render(@NotNull GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTick ){
            // затемнение фона (стандартный фон screen)
            this.renderBackground(guiGraphics);

            // TODO: позже заменить fill() на текстуру GUI

            // временная тестовая панель GUI
            // NOTE: пока просто прямоугольник, позже заменить на текстуру
            guiGraphics.fill(leftPos,topPos,
                    leftPos+IMAGE_WIDTH,
                    topPos+IMAGE_HEIGHT,
                    0xAA000000
            );

            // заголовок экрана
            guiGraphics.drawCenteredString(this.font,
                    this.title,
                    this.width / 2,
                    topPos + 15,
                    0xFFFFFF
            );
            // отображение предметов на экране
            guiGraphics.renderItem(reel.get(1), leftPos + 100, topPos + 80);



            super.render(guiGraphics, mouseX, mouseY, partialTick);



            // TODO: здесь позже будет отрисовка ленты предметов
            // TODO: здесь будет отрисовка рамки победителя
        }

        @Override
        public boolean isPauseScreen(){
            // тут игра не в паузе при открытии кейса
            return false;
        }

    // TODO: параметры imageWidth/imageHeight сейчас не используются
    // NOTE: либо убрать их из конструктора, либо реально использовать

    public CaseOpenScreen(int imageWidth, int imageHeidht, CaseType caseType){
        super(TITLE);


        this.caseType = caseType;
    }
    //GUI
    //анимация
    //отрисовка ленты
}

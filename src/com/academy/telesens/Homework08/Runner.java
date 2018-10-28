package com.academy.telesens.Homework08;

public class Runner {

    public static void main(String[] args) {
        Component[] arrayOfComponents = new Component[10];
        arrayOfComponents[0]= new Button();
        arrayOfComponents[1]= new Label();
        arrayOfComponents[2] = new CheckBox();
        arrayOfComponents[3] = new CheckBox();
        arrayOfComponents[4]= new Label();
        arrayOfComponents[5] = new RoundButton();
        arrayOfComponents[6] = new RoundButton();
        arrayOfComponents[7]= new Button();
        arrayOfComponents[8] = new CheckBox();
        arrayOfComponents[9]= new Label();

        printAllElements(arrayOfComponents);
        System.out.println("**************");
        printOnlyButtonElements(arrayOfComponents);
        WeekDays.SUNDAY.getDayBeforeYesterday();
        WeekDays.WEDNESDAY.getDayAfterTomorrow();

    }

    static public void printAllElements(Component[] arrayOfComponents) {
        for (int i = 0; i < arrayOfComponents.length; i++) {
            System.out.println(arrayOfComponents[i].toString());
        }
    }

    static public void printOnlyButtonElements(Component[] arrayOfComponents) {
        for (int i = 0; i < arrayOfComponents.length; ) {
            if (arrayOfComponents[i] instanceof Button) {
                System.out.println(arrayOfComponents[i].toString());
                i++;
            } else {
                i++;
            }

        }
        Component component = new Component();
        component.draw();
        component = new Button();
        component.draw();
        component = new CheckBox();
        component.draw();
        component = new Label();
        component.draw();
        component = new RoundButton();
        component.draw();

        component = new Component();
        component.draw3D();
        component = new Button();
        component.draw3D();
        component = new CheckBox();
        component.draw3D();
        component = new Label();
        component.draw3D();
        component = new RoundButton();
        component.draw3D();

    }
}

package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String [][] workers = {
            {"67035654236", "John", "Smith"},
            {"56325487965", "Ivone", "Novak"},
            {"69587458965", "Jessie", "Pinkman"},
            {"45874569651", "Walter", "White"},
            {"78546698546", "Clara", "Lanson"}
    };

    private double[] salaries = {
        4500.00,
        3700.00,
        4350.00,
        9000.00,
        6200.00
    };

    public String getWorker(int n) {
        if(n > salaries.length) {
            return "";
        }
        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + ", " + salaries[n];
    }

    public double[] getSalaries() {
        return salaries;
    }

    public String[][] getWorkers() {
        return workers;
    }
}

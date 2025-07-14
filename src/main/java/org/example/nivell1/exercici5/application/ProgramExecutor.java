package org.example.nivell1.exercici5.module;



public class ProgramExecutor {

    public void executeProgram() {
        PiValueProvider piValue = () -> 3.1415;
        PiValueService service = new PiValueService(piValue);
        service.printPiValue();
    }
}

package Homeworks14and15;

public interface CanFly2 extends CanMove {

    default double speed(CanFly2 canFly) {
        return CanMove.super.speed();
    }}


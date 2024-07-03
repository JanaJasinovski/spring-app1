package ru.alishev.springcouse;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Wind cried Mary";
    }
}

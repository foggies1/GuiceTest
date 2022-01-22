package net.foggies.guice.interfaces;

public interface Openable {

    <T> void onOpen(T... args);

}

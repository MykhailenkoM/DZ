package player;


class PlayerCode implements Playable, Recordable {

    @Override
    public void play() {
        System.out.println("Воспроизведение началось");
    }

    @Override
    public void record() {
        System.out.println("Запись началась");
    }

    @Override
    public void pause() {
        System.out.println("Пауза");
    }

    @Override
    public void stop() {
        System.out.println("Остановлено");
    }

}

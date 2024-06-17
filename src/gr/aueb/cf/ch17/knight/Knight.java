package gr.aueb.cf.ch17.knight;

public class Knight implements IKnight {

    @Override
    public void embrakInMission(IMission mission) {
        mission.embrak();
    }
}

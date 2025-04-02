package ch13_abstraction.interfaces;

public class TvRemoteController {
    private PowerButton powerButton;
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;

    public TvRemoteController(PowerButton powerButton, ChannelDownButton channelDownButton, ChannelUpButton channelUpButton, VolumeDownButton volumeDownButton, VolumeUpButton volumeUpButton) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        this.volumeDownButton = volumeDownButton;
        this.volumeUpButton = volumeUpButton;
    }

    // 이제 저 필드(객체)들을 이용한 메서드 정의
    public void onPressedPowerButton() {
        powerButton.onPressed();
    }

    public void onPressedChannelDownButton() {
        channelDownButton.onPressed();
    }

    public void onDownChannelDownButton() {
        channelDownButton.onDown();
    }

    // onPressedChannelUpButton() 메서드와 onUpChannelUpButton() 메서드를 구현하시오.
    // Main에서 둘 다 호출하시오.
    public void onPressedChannelUpButton() {
        channelUpButton.onPressed();
    }

    public void onUpChannelUpButton() {
        System.out.println(channelUpButton.onUp());
    }


    // volumeDown과 관련된 두 개의 메서드를 정의할 수 있게 됩니다.
    public void onPressedVolumeDownButton() {
        volumeDownButton.onPressed();
    }

    public void onDownVolumeDownButton() {
        volumeDownButton.onDown();
    }

    public void onPressedVolumeUpButton() {
        volumeUpButton.onPressed();
    }

    public void onUpVoulmeUpButton() {
        System.out.println(volumeUpButton.onUp());
    }

}
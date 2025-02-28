package eu.faircode.xlua.random.randomizers;

import androidx.annotation.NonNull;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import eu.faircode.xlua.random.IRandomizer;
import eu.faircode.xlua.random.elements.ISpinnerElement;
import eu.faircode.xlua.utilities.RandomStringGenerator;

public class RandomManufacturer implements IRandomizer {
    private static final String[] DEFAULT_MANUFACTURERS = new String[] {
            "Apple",
            "Samsung",
            "LG",
            "Xiaomi",
            "Huawei",
            "Lenovo",
            "Vivo",
            "OnePlus",
            "Motorola",
            "Google",
            "Alcatel",
            "Asus",
            "ZTE",
            "Sony",
            "HTC",
    };


    @Override
    public boolean isSetting(String setting) { return setting.equalsIgnoreCase(getSettingName()); }

    @Override
    public String getSettingName() {  return "device.manufacturer"; }

    @Override
    public String getName() {
        return "Device Manufacturer";
    }

    @Override
    public String getID() {
        return "%device_manufacturer%";
    }

    @Override
    public String generateString() { return DEFAULT_MANUFACTURERS[ThreadLocalRandom.current().nextInt(0, DEFAULT_MANUFACTURERS.length)]; }

    @Override
    public int generateInteger() { return 0; }

    @Override
    public List<ISpinnerElement> getOptions() { return null; }

    @NonNull
    @Override
    public String toString() {
        return getName();
    }
}

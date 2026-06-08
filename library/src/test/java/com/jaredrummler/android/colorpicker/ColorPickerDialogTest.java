package com.jaredrummler.android.colorpicker;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ColorPickerDialogTest {

    @Test
    public void colorStringValidationRejectsNonHexInput() {
        assertFalse(ColorPickerDialog.isValidColorString(" "));
        assertFalse(ColorPickerDialog.isValidColorString("FF FF"));
        assertFalse(ColorPickerDialog.isValidColorString("123456789"));
    }

    @Test
    public void colorStringValidationAcceptsValidAndPartialInput() {
        assertTrue(ColorPickerDialog.isValidColorString(""));
        assertTrue(ColorPickerDialog.isValidColorString("#"));
        assertTrue(ColorPickerDialog.isValidColorString("aF09"));
        assertTrue(ColorPickerDialog.isValidColorString("#A1B2C3D4"));
    }
}

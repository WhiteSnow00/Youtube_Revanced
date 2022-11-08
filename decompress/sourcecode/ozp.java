// 
// Decompiled by Procyon v0.6.0
// 

public final class ozp
{
    public final ozq a;
    
    public ozp(final ozq a) {
        this.a = a;
    }
    
    public static ozp a() {
        return c().i();
    }
    
    public static php b() {
        return new php(22);
    }
    
    public static php c() {
        return new php(5);
    }
    
    @Override
    public final String toString() {
        final String string = super.toString();
        final ozq a = this.a;
        final int d = afqg.d(a.c);
        String s = null;
        Label_0551: {
            if (d != 0) {
                switch (d) {
                    default: {
                        s = "null";
                        break Label_0551;
                    }
                    case 48: {
                        s = "INPUT_STYLUS";
                        break Label_0551;
                    }
                    case 47: {
                        s = "CAUSAL_AUTOMATED";
                        break Label_0551;
                    }
                    case 46: {
                        s = "CAUSAL_USER_ACTION";
                        break Label_0551;
                    }
                    case 42: {
                        s = "ENTER_PROXIMITY";
                        break Label_0551;
                    }
                    case 41: {
                        s = "TWO_FINGER_DRAG";
                        break Label_0551;
                    }
                    case 40: {
                        s = "MULTI_KEY_PRESS";
                        break Label_0551;
                    }
                    case 39: {
                        s = "FORCE_TOUCH";
                        break Label_0551;
                    }
                    case 38: {
                        s = "DROP";
                        break Label_0551;
                    }
                    case 37: {
                        s = "ROLL";
                        break Label_0551;
                    }
                    case 36: {
                        s = "DOUBLE_TAP";
                        break Label_0551;
                    }
                    case 35: {
                        s = "DOUBLE_CLICK";
                        break Label_0551;
                    }
                    case 34: {
                        s = "ACTION_BY_TIMER";
                        break Label_0551;
                    }
                    case 33: {
                        s = "KEY_PRESS";
                        break Label_0551;
                    }
                    case 32: {
                        s = "LONG_PRESS";
                        break Label_0551;
                    }
                    case 31: {
                        s = "DRAG";
                        break Label_0551;
                    }
                    case 30: {
                        s = "SHAKE";
                        break Label_0551;
                    }
                    case 29: {
                        s = "HEAD_MOVEMENT";
                        break Label_0551;
                    }
                    case 28: {
                        s = "UNKNOWN_ACTION";
                        break Label_0551;
                    }
                    case 27: {
                        s = "BACK_BUTTON";
                        break Label_0551;
                    }
                    case 26: {
                        s = "NAVIGATE";
                        break Label_0551;
                    }
                    case 25: {
                        s = "ARROW_KEYS";
                        break Label_0551;
                    }
                    case 24: {
                        s = "MOUSE_WHEEL";
                        break Label_0551;
                    }
                    case 23: {
                        s = "SCROLL_BAR";
                        break Label_0551;
                    }
                    case 22: {
                        s = "SWIPE";
                        break Label_0551;
                    }
                    case 21: {
                        s = "DIRECTIONAL_MOVEMENT";
                        break Label_0551;
                    }
                    case 20: {
                        s = "ROTATE_SCREEN";
                        break Label_0551;
                    }
                    case 19: {
                        s = "RESIZE_BROWSER";
                        break Label_0551;
                    }
                    case 18: {
                        s = "INPUT_VOICE";
                        break Label_0551;
                    }
                    case 17: {
                        s = "INPUT_KEYBOARD";
                        break Label_0551;
                    }
                    case 16: {
                        s = "INPUT_TEXT";
                        break Label_0551;
                    }
                    case 15: {
                        s = "PINCH_CLOSED";
                        break Label_0551;
                    }
                    case 14: {
                        s = "PINCH_OPEN";
                        break Label_0551;
                    }
                    case 13: {
                        s = "PINCH";
                        break Label_0551;
                    }
                    case 12: {
                        s = "OUT_OF_BOUNDING_BOX";
                        break Label_0551;
                    }
                    case 11: {
                        s = "INTO_BOUNDING_BOX";
                        break Label_0551;
                    }
                    case 10: {
                        s = "HOVER";
                        break Label_0551;
                    }
                    case 9: {
                        s = "RIGHT_CLICK";
                        break Label_0551;
                    }
                    case 8: {
                        s = "LEFT_CLICK";
                        break Label_0551;
                    }
                    case 7: {
                        s = "MOUSE_CLICK";
                        break Label_0551;
                    }
                    case 6: {
                        s = "KEYBOARD_ENTER";
                        break Label_0551;
                    }
                    case 5: {
                        s = "TAP";
                        break Label_0551;
                    }
                    case 4: {
                        s = "GENERIC_CLICK";
                        break Label_0551;
                    }
                    case 3: {
                        s = "USER";
                        break Label_0551;
                    }
                    case 2: {
                        s = "AUTOMATED";
                        break Label_0551;
                    }
                    case 1: {
                        break;
                    }
                }
            }
            s = "UNASSIGNED_USER_ACTION_ID";
        }
        final String value = String.valueOf(a);
        final StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append(" ");
        sb.append(s);
        sb.append(" ");
        sb.append(value);
        return sb.toString();
    }
}

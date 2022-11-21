// 
// Decompiled by Procyon v0.6.0
// 

public final class arfy extends Exception
{
    public arfy(final int n) {
        String string = null;
        switch (n) {
            default: {
                final StringBuilder sb = new StringBuilder("Invalid connection result: ");
                sb.append(n);
                string = sb.toString();
                break;
            }
            case 8: {
                string = "An unknown failure occurred";
                break;
            }
            case 7: {
                string = "This operation is not supported on this device";
                break;
            }
            case 6: {
                string = "No permission to do operation";
                break;
            }
            case 5: {
                string = "VR Service not connected";
                break;
            }
            case 4: {
                string = "VR Service obsolete";
                break;
            }
            case 3: {
                string = "VR Service updating";
                break;
            }
            case 2: {
                string = "VR Service disabled";
                break;
            }
            case 1: {
                string = "VR Service missing";
                break;
            }
            case 0: {
                string = "VR Service present";
                break;
            }
        }
        super(string);
    }
}

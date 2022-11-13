// 
// Decompiled by Procyon v0.6.0
// 

final class aqte
{
    int a;
    int b;
    int c;
    int[] d;
    
    public aqte(final int a) {
        this.a = a;
    }
    
    static boolean a(final int n) {
        return n >= 8;
    }
    
    private static String b(final int[] array) {
        final StringBuilder sb = new StringBuilder();
        sb.append('\"');
        for (int length = array.length, i = 0; i < length; ++i) {
            aqtn.b(sb, array[i]);
        }
        sb.append('\"');
        return sb.toString();
    }
    
    @Override
    public final String toString() {
        switch (this.a) {
            default: {
                throw new IllegalStateException("unhandled case in Inst.toString");
            }
            case 11: {
                final int b = this.b;
                final StringBuilder sb = new StringBuilder("anynotnl -> ");
                sb.append(b);
                return sb.toString();
            }
            case 10: {
                final int b2 = this.b;
                final StringBuilder sb2 = new StringBuilder("any -> ");
                sb2.append(b2);
                return sb2.toString();
            }
            case 9: {
                final String b3 = b(this.d);
                final int b4 = this.b;
                final StringBuilder sb3 = new StringBuilder("rune1 ");
                sb3.append(b3);
                sb3.append(" -> ");
                sb3.append(b4);
                return sb3.toString();
            }
            case 8: {
                final int[] d = this.d;
                if (d == null) {
                    return "rune <null>";
                }
                final String b5 = b(d);
                final int c = this.c;
                final int b6 = this.b;
                final StringBuilder sb4 = new StringBuilder("rune ");
                sb4.append(b5);
                String s;
                if (0x1 != (c & 0x1)) {
                    s = "";
                }
                else {
                    s = "/i";
                }
                sb4.append(s);
                sb4.append(" -> ");
                sb4.append(b6);
                return sb4.toString();
            }
            case 7: {
                final int b7 = this.b;
                final StringBuilder sb5 = new StringBuilder("nop -> ");
                sb5.append(b7);
                return sb5.toString();
            }
            case 6: {
                return "match";
            }
            case 5: {
                return "fail";
            }
            case 4: {
                final int c2 = this.c;
                final int b8 = this.b;
                final StringBuilder sb6 = new StringBuilder("empty ");
                sb6.append(c2);
                sb6.append(" -> ");
                sb6.append(b8);
                return sb6.toString();
            }
            case 3: {
                final int c3 = this.c;
                final int b9 = this.b;
                final StringBuilder sb7 = new StringBuilder("cap ");
                sb7.append(c3);
                sb7.append(" -> ");
                sb7.append(b9);
                return sb7.toString();
            }
            case 2: {
                final int b10 = this.b;
                final int c4 = this.c;
                final StringBuilder sb8 = new StringBuilder("altmatch -> ");
                sb8.append(b10);
                sb8.append(", ");
                sb8.append(c4);
                return sb8.toString();
            }
            case 1: {
                final int b11 = this.b;
                final int c5 = this.c;
                final StringBuilder sb9 = new StringBuilder("alt -> ");
                sb9.append(b11);
                sb9.append(", ");
                sb9.append(c5);
                return sb9.toString();
            }
        }
    }
}

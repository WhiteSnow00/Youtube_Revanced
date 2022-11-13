import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apng extends ahbc implements ahbd
{
    public static final apng a;
    private static volatile ahdd k;
    private ajut A;
    private ajut B;
    private ajut C;
    private ajut D;
    private aidg E;
    private apnd F;
    private ajut G;
    private ahhu H;
    private apni I;
    private apne J;
    private apnh K;
    private aiqj L;
    private byte M;
    public int b;
    public int c;
    public ajut d;
    public ajut e;
    public ajut f;
    public boolean g;
    public boolean h;
    public ajut i;
    public alob j;
    private aiao m;
    private aiao n;
    private ajut o;
    private apnj p;
    private ajut q;
    private ajut r;
    private apnf s;
    private ajut t;
    private ajut u;
    private ajut v;
    private ajut w;
    private ajut x;
    private ajut y;
    private ajut z;
    
    static {
        ahbh.registerDefaultInstance((Class)apng.class, (ahbh)(a = new apng()));
    }
    
    private apng() {
        this.M = 2;
        this.g = true;
        this.h = true;
        emptyProtobufList();
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte m = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd k;
                if ((k = apng.k) == null) {
                    synchronized (apng.class) {
                        if (apng.k == null) {
                            apng.k = (ahdd)new ahba((ahbh)apng.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return apng.a;
            }
            case 4: {
                return new ahbb((ahbc)apng.a);
            }
            case 3: {
                return new apng();
            }
            case 2: {
                return newMessageInfo((MessageLite)apng.a, "\u0001!\u0000\u0002\u00015!\u0000\u0000\u001f\u0001\u1409\u0002\u0002\u1409\u0004\u0003\u1409\u0007\u0004\u1409\u000b\u0005\u1409\r\u0006\u1409\n\u0007\u1409\f\b\u1007\u001a\t\u1007\u001b\n\u1409\u001c\r\u1409 \u000f\u1409'\u0011\u1409&\u0012\u1409\u0006\u0014\u1409)\u0015\u1409*\u0016\u1409\u0005\u0019\u1409,\u001e\u1409!\u001f\u1409$!\u1409\u0003\"\u1409\u0000#\u1409\u0001%\u1409\u000f)\u1409.*\u1409\b-\u1409\u001d.\u1409\u0010/\u1409\u00122\u1409\u00163\u1409\u00134\u1409\u00175\u1409\u0018", new Object[] { "b", "c", "d", "e", "r", "u", "f", "t", "v", "g", "h", "i", "j", "H", "G", "q", "I", "J", "p", "K", "E", "F", "o", "m", "n", "w", "L", "s", "D", "x", "y", "A", "z", "B", "C" });
            }
            case 1: {
                if (o == null) {
                    m = 0;
                }
                this.M = m;
                return null;
            }
            case 0: {
                return this.M;
            }
        }
    }
}

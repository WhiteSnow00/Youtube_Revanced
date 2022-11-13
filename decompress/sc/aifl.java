import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aifl extends ahbh implements ahcw
{
    public static final aifl a;
    private static volatile ahdd b;
    private ajut A;
    private ajut B;
    private aifr C;
    private aiqj D;
    private ajut E;
    private byte F;
    private int c;
    private int d;
    private ajut e;
    private ajut f;
    private ajut g;
    private ajut h;
    private ajut i;
    private ajut j;
    private ajut k;
    private ajut l;
    private aifs m;
    private ajut n;
    private ajut o;
    private ajut p;
    private ajut q;
    private ajut r;
    private ajut s;
    private aifv t;
    private aift u;
    private aifu v;
    private aifp w;
    private aiqj x;
    private ajut y;
    private aifm z;
    
    static {
        ahbh.registerDefaultInstance((Class)aifl.class, (ahbh)(a = new aifl()));
    }
    
    private aifl() {
        this.F = 2;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aifl.b) == null) {
                    synchronized (aifl.class) {
                        if (aifl.b == null) {
                            aifl.b = (ahdd)new ahba((ahbh)aifl.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aifl.a;
            }
            case 4: {
                return new ahaz((ahbh)aifl.a);
            }
            case 3: {
                return new aifl();
            }
            case 2: {
                return newMessageInfo((MessageLite)aifl.a, "\u0001\u001b\u0000\u0002\u0001)\u001b\u0000\u0000\u001b\u0001\u1409\u0004\u0004\u1409\u000e\u0005\u1409\u000f\u0006\u1409\u0010\u0007\u1409\u0012\b\u1409\u0013\t\u1409\u0014\n\u1409\u0015\f\u1409\u0016\u0012\u1409\u001f\u0013\u1409\u0000\u0015\u1409\n\u0016\u1409\u000b\u0018\u1409\u001b\u0019\u1409\u001c\u001a\u1409\u0003\u001b\u1409\u0018\u001c\u1409\f\u001d\u1409\r\u001e\u1409\t\u001f\u1409\u0006 \u1409\u0005%\u1409\u0007&\u1409\u001d'\u1409 (\u1409!)\u1409\u0011", new Object[] { "c", "d", "g", "p", "q", "r", "t", "u", "v", "w", "x", "C", "e", "l", "m", "z", "A", "f", "y", "n", "o", "k", "i", "h", "j", "B", "D", "E", "s" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.F = f;
                return null;
            }
            case 0: {
                return this.F;
            }
        }
    }
}

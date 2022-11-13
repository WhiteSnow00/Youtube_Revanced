import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akfa extends ahbh implements ahcw
{
    public static final akfa a;
    private static volatile ahdd k;
    public int b;
    public aotp c;
    public ajut d;
    public ajut e;
    public boolean f;
    public ajut g;
    public aiqj h;
    public ahbx i;
    public ahab j;
    private akem l;
    private ahhu m;
    private byte n;
    
    static {
        ahbh.registerDefaultInstance((Class)akfa.class, (ahbh)(a = new akfa()));
    }
    
    private akfa() {
        this.n = 2;
        this.i = emptyProtobufList();
        this.j = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte n = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd k;
                if ((k = akfa.k) == null) {
                    synchronized (akfa.class) {
                        if (akfa.k == null) {
                            akfa.k = (ahdd)new ahba((ahbh)akfa.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return akfa.a;
            }
            case 4: {
                return new ahaz((ahbh)akfa.a);
            }
            case 3: {
                return new akfa();
            }
            case 2: {
                return newMessageInfo((MessageLite)akfa.a, "\u0001\n\u0000\u0001\u0001\u0010\n\u0000\u0001\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u1409\u0004\u0007\u1409\u0007\b\u100a\b\t\u1409\u0002\n\u1007\u0003\u000e\u001b\u000f\u1409\u0005\u0010\u1409\u0006", new Object[] { "b", "c", "d", "l", "m", "j", "e", "f", "i", alwh.class, "g", "h" });
            }
            case 1: {
                if (o == null) {
                    n = 0;
                }
                this.n = n;
                return null;
            }
            case 0: {
                return this.n;
            }
        }
    }
}

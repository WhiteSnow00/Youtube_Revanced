import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajnh extends ahcz implements aheo
{
    public static final ajnh a;
    public static final ahcx b;
    private static volatile ahev g;
    public int c;
    public int d;
    public ahbt e;
    public anxb f;
    private anxb h;
    private byte i;
    
    static {
        final ajnh a2 = new ajnh();
        ahcz.registerDefaultInstance(ajnh.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aisc.a, a2, (MessageLite)a2, null, 253749840, ahgc.k, ajnh.class);
    }
    
    private ajnh() {
        this.i = 2;
        this.e = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = ajnh.g) == null) {
                    synchronized (ajnh.class) {
                        if (ajnh.g == null) {
                            ajnh.g = (ahev)new ahcs((ahcz)ajnh.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ajnh.a;
            }
            case 4: {
                return new ahcr((ahcz)ajnh.a);
            }
            case 3: {
                return new ajnh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajnh.a, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0002\u0002\u100c\u0001\u0003\u100a\u0002\u0004\u1409\u0003\u0005\u1409\u0004", new Object[] { "c", "d", aovv.a(), "e", "f", "h" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}

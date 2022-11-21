import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alen extends ahcz implements aheo
{
    public static final alen a;
    private static volatile ahev h;
    public int b;
    public aknh c;
    public String d;
    public String e;
    public apks f;
    public aior g;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(alen.class, a = new alen());
    }
    
    private alen() {
        this.i = 2;
        this.d = "";
        this.e = "";
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
                final ahev h;
                if ((h = alen.h) == null) {
                    synchronized (alen.class) {
                        if (alen.h == null) {
                            alen.h = (ahev)new ahcs((ahcz)alen.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return alen.a;
            }
            case 4: {
                return new ahcr((ahcz)alen.a);
            }
            case 3: {
                return new alen();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alen.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1009\u0003\u0006\u1009\u0005", new Object[] { "b", "c", "d", "e", "f", "g" });
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

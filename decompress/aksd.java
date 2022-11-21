import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aksd extends ahcz implements aheo
{
    public static final aksd a;
    private static volatile ahev h;
    public int b;
    public aknh c;
    public int d;
    public String e;
    public boolean f;
    public int g;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(aksd.class, a = new aksd());
    }
    
    private aksd() {
        this.i = 2;
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
                if ((h = aksd.h) == null) {
                    synchronized (aksd.class) {
                        if (aksd.h == null) {
                            aksd.h = (ahev)new ahcs((ahcz)aksd.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aksd.a;
            }
            case 4: {
                return new ahcr((ahcz)aksd.a);
            }
            case 3: {
                return new aksd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aksd.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u100b\u0001\u0003\u1008\u0002\u0005\u1007\u0003\u0006\u100c\u0004", new Object[] { "b", "c", "d", "e", "f", "g", apnc.g });
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

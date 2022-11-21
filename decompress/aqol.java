import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqol extends ahcz implements aheo
{
    public static final aqol a;
    private static volatile ahev h;
    public int b;
    public String c;
    public ahfq d;
    public int e;
    public String f;
    public aqom g;
    private ahej i;
    
    static {
        ahcz.registerDefaultInstance(aqol.class, a = new aqol());
    }
    
    private aqol() {
        this.i = ahej.a;
        this.c = "";
        this.f = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev h;
                if ((h = aqol.h) == null) {
                    synchronized (aqol.class) {
                        if (aqol.h == null) {
                            aqol.h = (ahev)new ahcs((ahcz)aqol.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aqol.a;
            }
            case 4: {
                return new ahcr((ahcz)aqol.a);
            }
            case 3: {
                return new aqol();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqol.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0001\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001\u0003\u100c\u0002\u0004\u1008\u0003\u00052\u0006\u1009\u0004", new Object[] { "b", "c", "d", "e", aqnr.c, "f", "i", aqok.a, "g" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}

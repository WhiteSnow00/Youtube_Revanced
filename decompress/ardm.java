import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ardm extends ahcz implements aheo
{
    public static final ardm a;
    private static volatile ahev e;
    public int b;
    public String c;
    public int d;
    
    static {
        ahcz.registerDefaultInstance(ardm.class, a = new ardm());
    }
    
    private ardm() {
        this.c = "";
        this.d = 1;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = ardm.e) == null) {
                    synchronized (ardm.class) {
                        if (ardm.e == null) {
                            ardm.e = (ahev)new ahcs((ahcz)ardm.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ardm.a;
            }
            case 4: {
                return new ahcr((ahcz)ardm.a);
            }
            case 3: {
                return new ardm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ardm.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001", new Object[] { "b", "c", "d", aqym.t });
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

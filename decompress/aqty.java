import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqty extends ahcz implements aheo
{
    public static final aqty a;
    private static volatile ahev e;
    public int b;
    public int c;
    public boolean d;
    
    static {
        ahcz.registerDefaultInstance(aqty.class, a = new aqty());
    }
    
    private aqty() {
        this.c = 1;
        this.d = true;
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
                if ((e = aqty.e) == null) {
                    synchronized (aqty.class) {
                        if (aqty.e == null) {
                            aqty.e = (ahev)new ahcs((ahcz)aqty.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqty.a;
            }
            case 4: {
                return new ahcr((ahcz)aqty.a);
            }
            case 3: {
                return new aqty();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqty.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1007\u0001", new Object[] { "b", "c", aqnr.o, "d" });
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

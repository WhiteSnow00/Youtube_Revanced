import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agrw extends ahcz implements aheo
{
    public static final agrw a;
    private static volatile ahev h;
    public agrt b;
    public agrr c;
    public agrq d;
    public agrs e;
    public agrn f;
    public agro g;
    private ahej i;
    
    static {
        ahcz.registerDefaultInstance(agrw.class, a = new agrw());
    }
    
    private agrw() {
        this.i = ahej.a;
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
                if ((h = agrw.h) == null) {
                    synchronized (agrw.class) {
                        if (agrw.h == null) {
                            agrw.h = (ahev)new ahcs((ahcz)agrw.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return agrw.a;
            }
            case 4: {
                return new ahcr((ahcz)agrw.a);
            }
            case 3: {
                return new agrw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agrw.a, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u00052\u0006\t\u0007\t", new Object[] { "b", "c", "d", "f", "i", agrv.a, "e", "g" });
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

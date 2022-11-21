import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqrm extends ahcz implements aheo
{
    public static final aqrm a;
    private static volatile ahev h;
    public int b;
    public Object c;
    public int d;
    public Object e;
    public int f;
    public Object g;
    
    static {
        ahcz.registerDefaultInstance(aqrm.class, a = new aqrm());
    }
    
    private aqrm() {
        this.b = 0;
        this.d = 0;
        this.f = 0;
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
                if ((h = aqrm.h) == null) {
                    synchronized (aqrm.class) {
                        if (aqrm.h == null) {
                            aqrm.h = (ahev)new ahcs((ahcz)aqrm.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aqrm.a;
            }
            case 4: {
                return new ahcr((ahcz)aqrm.a);
            }
            case 3: {
                return new aqrm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqrm.a, "\u0001\u0006\u0003\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000\u0003\u103c\u0001\u0004\u103c\u0001\u0005\u103c\u0002\u0006\u103c\u0002", new Object[] { "c", "b", "e", "d", "g", "f", aqra.class, aqqz.class, aqrj.class, aqri.class, aqrf.class, aqre.class });
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

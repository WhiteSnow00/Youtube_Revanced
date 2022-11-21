import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ansz extends ahcz implements aheo
{
    public static final ansz a;
    private static volatile ahev h;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    private int i;
    private int j;
    
    static {
        ahcz.registerDefaultInstance(ansz.class, a = new ansz());
    }
    
    private ansz() {
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
                if ((h = ansz.h) == null) {
                    synchronized (ansz.class) {
                        if (ansz.h == null) {
                            ansz.h = (ahev)new ahcs((ahcz)ansz.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ansz.a;
            }
            case 4: {
                return new ahcr((ahcz)ansz.a);
            }
            case 3: {
                return new ansz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ansz.a, "\u0001\u0006\u0000\u0002\u0003)\u0006\u0000\u0000\u0000\u0003\u1007\u001b\u001b\u1007\u0016\u001f\u1007\u001e$\u1007\u0004%\u1007\u0005)\u1007!", new Object[] { "i", "j", "e", "d", "f", "b", "c", "g" });
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

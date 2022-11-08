import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fbo extends agzi implements ahax
{
    public static final fbo a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public boolean d;
    
    static {
        agzi.registerDefaultInstance(fbo.class, a = new fbo());
    }
    
    private fbo() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = fbo.e) == null) {
                    synchronized (fbo.class) {
                        if (fbo.e == null) {
                            fbo.e = (ahbe)new agzb((agzi)fbo.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return fbo.a;
            }
            case 4: {
                return new agza((agzi)fbo.a);
            }
            case 3: {
                return new fbo();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)fbo.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1007\u0001", new Object[] { "b", "c", fbn.b(), "d" });
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

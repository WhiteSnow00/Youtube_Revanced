import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aorl extends agzi implements ahax
{
    public static final aorl a;
    private static volatile ahbe f;
    public int b;
    public String c;
    public int d;
    public int e;
    
    static {
        agzi.registerDefaultInstance(aorl.class, a = new aorl());
    }
    
    private aorl() {
        this.c = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = aorl.f) == null) {
                    synchronized (aorl.class) {
                        if (aorl.f == null) {
                            aorl.f = (ahbe)new agzb((agzi)aorl.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aorl.a;
            }
            case 4: {
                return new agza((agzi)aorl.a);
            }
            case 3: {
                return new aorl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aorl.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100b\u0001\u0003\u100b\u0002", new Object[] { "b", "c", "d", "e" });
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
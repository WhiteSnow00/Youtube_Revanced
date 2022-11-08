import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aooa extends agzi implements ahax
{
    public static final aooa a;
    private static volatile ahbe f;
    public int b;
    public String c;
    public boolean d;
    public int e;
    
    static {
        agzi.registerDefaultInstance((Class)aooa.class, (agzi)(a = new aooa()));
    }
    
    private aooa() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = aooa.f) == null) {
                    synchronized (aooa.class) {
                        if (aooa.f == null) {
                            aooa.f = (ahbe)new agzb((agzi)aooa.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aooa.a;
            }
            case 4: {
                return new agza((agzi)aooa.a);
            }
            case 3: {
                return new aooa();
            }
            case 2: {
                return newMessageInfo((MessageLite)aooa.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u100c\u0002", new Object[] { "b", "c", "d", "e", aonj.d });
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

import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aico extends agzi implements ahax
{
    public static final aico a;
    private static volatile ahbe f;
    public int b;
    public String c;
    public String d;
    public String e;
    
    static {
        agzi.registerDefaultInstance((Class)aico.class, (agzi)(a = new aico()));
    }
    
    private aico() {
        this.c = "";
        this.d = "";
        this.e = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = aico.f) == null) {
                    synchronized (aico.class) {
                        if (aico.f == null) {
                            aico.f = (ahbe)new agzb((agzi)aico.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aico.a;
            }
            case 4: {
                return new agza((agzi)aico.a);
            }
            case 3: {
                return new aico();
            }
            case 2: {
                return newMessageInfo((MessageLite)aico.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002", new Object[] { "b", "c", "d", "e" });
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

import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agsv extends agzi implements ahax
{
    public static final agsv a;
    private static volatile ahbe f;
    public int b;
    public String c;
    public String d;
    public int e;
    
    static {
        agzi.registerDefaultInstance(agsv.class, a = new agsv());
    }
    
    private agsv() {
        this.c = "";
        this.d = "";
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
                if ((f = agsv.f) == null) {
                    synchronized (agsv.class) {
                        if (agsv.f == null) {
                            agsv.f = (ahbe)new agzb((agzi)agsv.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agsv.a;
            }
            case 4: {
                return new agza((agzi)agsv.a);
            }
            case 3: {
                return new agsv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agsv.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u100c\u0002", new Object[] { "b", "c", "d", "e", afon.r });
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

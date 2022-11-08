import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jra extends agzi implements ahax
{
    public static final jra a;
    private static volatile ahbe e;
    public int b;
    public String c;
    public boolean d;
    
    static {
        agzi.registerDefaultInstance(jra.class, a = new jra());
    }
    
    private jra() {
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
                final ahbe e;
                if ((e = jra.e) == null) {
                    synchronized (jra.class) {
                        if (jra.e == null) {
                            jra.e = (ahbe)new agzb((agzi)jra.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return jra.a;
            }
            case 4: {
                return new agza((agzi)jra.a);
            }
            case 3: {
                return new jra();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)jra.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0001", new Object[] { "b", "c", "d" });
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

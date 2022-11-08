import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jqz extends agzi implements ahax
{
    public static final jqz a;
    private static volatile ahbe e;
    public int b;
    public jra c;
    public long d;
    
    static {
        agzi.registerDefaultInstance(jqz.class, a = new jqz());
    }
    
    private jqz() {
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
                if ((e = jqz.e) == null) {
                    synchronized (jqz.class) {
                        if (jqz.e == null) {
                            jqz.e = (ahbe)new agzb((agzi)jqz.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return jqz.a;
            }
            case 4: {
                return new agza((agzi)jqz.a);
            }
            case 3: {
                return new jqz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)jqz.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1002\u0001", new Object[] { "b", "c", "d" });
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

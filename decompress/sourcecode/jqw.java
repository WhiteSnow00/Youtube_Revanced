import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jqw extends agzi implements ahax
{
    public static final jqw a;
    private static volatile ahbe d;
    public int b;
    public boolean c;
    
    static {
        agzi.registerDefaultInstance(jqw.class, a = new jqw());
    }
    
    private jqw() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = jqw.d) == null) {
                    synchronized (jqw.class) {
                        if (jqw.d == null) {
                            jqw.d = (ahbe)new agzb((agzi)jqw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return jqw.a;
            }
            case 4: {
                return new agza((agzi)jqw.a);
            }
            case 3: {
                return new jqw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)jqw.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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

import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atxf extends agzi implements ahax
{
    public static final atxf a;
    private static volatile ahbe d;
    public int b;
    public int c;
    
    static {
        agzi.registerDefaultInstance(atxf.class, a = new atxf());
    }
    
    private atxf() {
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
                if ((d = atxf.d) == null) {
                    synchronized (atxf.class) {
                        if (atxf.d == null) {
                            atxf.d = (ahbe)new agzb((agzi)atxf.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return atxf.a;
            }
            case 4: {
                return new agza((agzi)atxf.a);
            }
            case 3: {
                return new atxf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)atxf.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1004\u0000", new Object[] { "b", "c" });
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

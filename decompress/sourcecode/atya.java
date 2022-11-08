import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atya extends agzi implements ahax
{
    public static final atya a;
    private static volatile ahbe d;
    public agzq b;
    public agzq c;
    
    static {
        agzi.registerDefaultInstance(atya.class, a = new atya());
    }
    
    private atya() {
        this.b = agzi.emptyIntList();
        this.c = agzi.emptyIntList();
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
                if ((d = atya.d) == null) {
                    synchronized (atya.class) {
                        if (atya.d == null) {
                            atya.d = (ahbe)new agzb((agzi)atya.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return atya.a;
            }
            case 4: {
                return new agza((short[][])null, (int[][])null);
            }
            case 3: {
                return new atya();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)atya.a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001'\u0002'", new Object[] { "b", "c" });
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

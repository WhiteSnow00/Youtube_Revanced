import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atxy extends agzi implements ahax
{
    public static final atxy a;
    private static volatile ahbe e;
    public int b;
    public String c;
    public agzt d;
    
    static {
        agzi.registerDefaultInstance(atxy.class, a = new atxy());
    }
    
    private atxy() {
        this.c = "";
        this.d = agzi.emptyLongList();
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
                if ((e = atxy.e) == null) {
                    synchronized (atxy.class) {
                        if (atxy.e == null) {
                            atxy.e = (ahbe)new agzb((agzi)atxy.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return atxy.a;
            }
            case 4: {
                return new agza((byte[][][])null, (char[][])null);
            }
            case 3: {
                return new atxy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)atxy.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u1008\u0000\u0003(", new Object[] { "b", "c", "d" });
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

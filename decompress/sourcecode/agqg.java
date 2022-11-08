import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqg extends agzi implements ahax
{
    public static final agqg a;
    private static volatile ahbe f;
    public int b;
    public int c;
    public agrc d;
    public agqo e;
    
    static {
        agzi.registerDefaultInstance(agqg.class, a = new agqg());
    }
    
    private agqg() {
        this.c = 5;
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
                if ((f = agqg.f) == null) {
                    synchronized (agqg.class) {
                        if (agqg.f == null) {
                            agqg.f = (ahbe)new agzb((agzi)agqg.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agqg.a;
            }
            case 4: {
                return new agza((agzi)agqg.a);
            }
            case 3: {
                return new agqg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agqg.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1009\u0001\u0003\u1009\u0002", new Object[] { "b", "c", afon.k, "d", "e" });
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

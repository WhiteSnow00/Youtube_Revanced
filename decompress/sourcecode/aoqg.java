import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoqg extends agzi implements ahax
{
    private static final aoqg a;
    private static volatile ahbe b;
    private int c;
    private int d;
    private String e;
    
    static {
        agzi.registerDefaultInstance(aoqg.class, a = new aoqg());
    }
    
    private aoqg() {
        this.e = "";
    }
    
    public static aoqf a() {
        return (aoqf)aoqg.a.createBuilder();
    }
    
    private void e(final int d) {
        this.c |= 0x1;
        this.d = d;
    }
    
    private void f(final String e) {
        e.getClass();
        this.c |= 0x4;
        this.e = e;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = aoqg.b) == null) {
                    synchronized (aoqg.class) {
                        if (aoqg.b == null) {
                            aoqg.b = (ahbe)new agzb((agzi)aoqg.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoqg.a;
            }
            case 4: {
                return new aoqf();
            }
            case 3: {
                return new aoqg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoqg.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0003\u1008\u0002", new Object[] { "c", "d", "e" });
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

import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajdt extends agzi implements ahax
{
    public static final ajdt a;
    private static volatile ahbe e;
    public int b;
    public String c;
    public String d;
    
    static {
        agzi.registerDefaultInstance(ajdt.class, a = new ajdt());
    }
    
    private ajdt() {
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
                final ahbe e;
                if ((e = ajdt.e) == null) {
                    synchronized (ajdt.class) {
                        if (ajdt.e == null) {
                            ajdt.e = (ahbe)new agzb((agzi)ajdt.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajdt.a;
            }
            case 4: {
                return new agza((agzi)ajdt.a);
            }
            case 3: {
                return new ajdt();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajdt.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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

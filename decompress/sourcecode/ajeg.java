import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajeg extends agzi implements ahax
{
    public static final ajeg a;
    private static volatile ahbe f;
    public int b;
    public String c;
    public String d;
    public String e;
    
    static {
        agzi.registerDefaultInstance(ajeg.class, a = new ajeg());
    }
    
    private ajeg() {
        this.c = "";
        this.d = "";
        this.e = "";
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
                if ((f = ajeg.f) == null) {
                    synchronized (ajeg.class) {
                        if (ajeg.f == null) {
                            ajeg.f = (ahbe)new agzb((agzi)ajeg.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajeg.a;
            }
            case 4: {
                return new agza((agzi)ajeg.a);
            }
            case 3: {
                return new ajeg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajeg.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002", new Object[] { "b", "c", "d", "e" });
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
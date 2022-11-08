import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aodc extends agzi implements ahax
{
    public static final aodc a;
    private static volatile ahbe f;
    public int b;
    public String c;
    public int d;
    public aoij e;
    
    static {
        agzi.registerDefaultInstance(aodc.class, a = new aodc());
    }
    
    private aodc() {
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
                final ahbe f;
                if ((f = aodc.f) == null) {
                    synchronized (aodc.class) {
                        if (aodc.f == null) {
                            aodc.f = (ahbe)new agzb((agzi)aodc.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aodc.a;
            }
            case 4: {
                return new agza((agzi)aodc.a);
            }
            case 3: {
                return new aodc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aodc.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100b\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d", "e" });
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

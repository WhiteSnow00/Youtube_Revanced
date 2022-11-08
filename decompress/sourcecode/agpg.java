import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpg extends agzi implements ahax
{
    public static final agpg a;
    private static volatile ahbe j;
    public int b;
    public String c;
    public int d;
    public ahca e;
    public ahca f;
    public agpi g;
    public agpd h;
    public agpf i;
    
    static {
        agzi.registerDefaultInstance(agpg.class, a = new agpg());
    }
    
    private agpg() {
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
                final ahbe j;
                if ((j = agpg.j) == null) {
                    synchronized (agpg.class) {
                        if (agpg.j == null) {
                            agpg.j = (ahbe)new agzb((agzi)agpg.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return agpg.a;
            }
            case 4: {
                return new agza((agzi)agpg.a);
            }
            case 3: {
                return new agpg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agpg.a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001\u100c\u0001\u0002\u1009\u0002\u0003\u1009\u0003\u0004\u1009\u0004\u0005\u1009\u0005\u0007\u1008\u0000\b\u1009\u0007", new Object[] { "b", "d", agpe.b(), "e", "f", "g", "h", "c", "i" });
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

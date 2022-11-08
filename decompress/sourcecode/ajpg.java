import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajpg extends agzi implements ahax
{
    public static final ajpg a;
    private static volatile ahbe c;
    public ahas b;
    
    static {
        agzi.registerDefaultInstance((Class)ajpg.class, (agzi)(a = new ajpg()));
    }
    
    private ajpg() {
        this.b = ahas.a;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = ajpg.c) == null) {
                    synchronized (ajpg.class) {
                        if (ajpg.c == null) {
                            ajpg.c = (ahbe)new agzb((agzi)ajpg.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajpg.a;
            }
            case 4: {
                return new agza((agzi)ajpg.a);
            }
            case 3: {
                return new ajpg();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajpg.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[] { "b", ajpf.a });
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

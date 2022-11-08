import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apyg extends agzd implements agze
{
    public static final apyg a;
    private static volatile ahbe b;
    private byte c;
    
    static {
        agzi.registerDefaultInstance(apyg.class, (agzi)(a = new apyg()));
    }
    
    private apyg() {
        this.c = 2;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = apyg.b) == null) {
                    synchronized (apyg.class) {
                        if (apyg.b == null) {
                            apyg.b = (ahbe)new agzb((agzi)apyg.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apyg.a;
            }
            case 4: {
                return new agzc((agzd)apyg.a);
            }
            case 3: {
                return new apyg();
            }
            case 2: {
                return newMessageInfo((MessageLite)apyg.a, "\u0001\u0000", (Object[])null);
            }
            case 1: {
                this.c = (byte)((o != null) ? 1 : 0);
                return null;
            }
            case 0: {
                return this.c;
            }
        }
    }
}

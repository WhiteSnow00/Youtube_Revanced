import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqhy extends agzi implements ahax
{
    public static final aqhy a;
    private static volatile ahbe b;
    private byte c;
    
    static {
        agzi.registerDefaultInstance((Class)aqhy.class, (agzi)(a = new aqhy()));
    }
    
    private aqhy() {
        this.c = 2;
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = aqhy.b) == null) {
                    synchronized (aqhy.class) {
                        if (aqhy.b == null) {
                            aqhy.b = (ahbe)new agzb((agzi)aqhy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqhy.a;
            }
            case 4: {
                return new agza((agzi)aqhy.a);
            }
            case 3: {
                return new aqhy();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqhy.a, "\u0001\u0000", (Object[])null);
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

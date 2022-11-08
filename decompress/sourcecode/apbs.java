import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apbs extends agzi implements ahax
{
    private static final apbs a;
    private static volatile ahbe b;
    private agzy c;
    
    static {
        agzi.registerDefaultInstance(apbs.class, a = new apbs());
    }
    
    private apbs() {
        this.c = agzi.emptyProtobufList();
    }
    
    public static /* synthetic */ apbs a() {
        return apbs.a;
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
                if ((b = apbs.b) == null) {
                    synchronized (apbs.class) {
                        if (apbs.b == null) {
                            apbs.b = (ahbe)new agzb((agzi)apbs.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apbs.a;
            }
            case 4: {
                return new agza((agzi)a());
            }
            case 3: {
                return new apbs();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apbs.a, "\u0001\u0000", null);
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

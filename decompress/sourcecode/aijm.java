import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aijm extends agzi implements ahax
{
    private static final aijm a;
    private static volatile ahbe b;
    private agzq c;
    
    static {
        agzi.registerDefaultInstance(aijm.class, a = new aijm());
    }
    
    private aijm() {
        this.c = agzi.emptyIntList();
    }
    
    public static /* synthetic */ aijm a() {
        return aijm.a;
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
                if ((b = aijm.b) == null) {
                    synchronized (aijm.class) {
                        if (aijm.b == null) {
                            aijm.b = (ahbe)new agzb((agzi)aijm.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aijm.a;
            }
            case 4: {
                return new agza((agzi)a());
            }
            case 3: {
                return new aijm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aijm.a, "\u0001\u0000", null);
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

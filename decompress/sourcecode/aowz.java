import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aowz extends agzi implements ahax
{
    private static final aowz a;
    private static volatile ahbe b;
    private String c;
    private String d;
    
    static {
        agzi.registerDefaultInstance(aowz.class, a = new aowz());
    }
    
    private aowz() {
        this.c = "";
        this.d = "";
    }
    
    public static /* synthetic */ aowz a() {
        return aowz.a;
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
                if ((b = aowz.b) == null) {
                    synchronized (aowz.class) {
                        if (aowz.b == null) {
                            aowz.b = (ahbe)new agzb((agzi)aowz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aowz.a;
            }
            case 4: {
                return new agza((agzi)a());
            }
            case 3: {
                return new aowz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aowz.a, "\u0001\u0000", null);
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

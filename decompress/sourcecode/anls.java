import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anls extends agzi implements ahax
{
    public static final anls a;
    public static final agzg b;
    private static volatile ahbe g;
    public int c;
    public String d;
    public String e;
    public aocd f;
    
    static {
        final anls a2 = new anls();
        agzi.registerDefaultInstance(anls.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 406356192, ahcm.k, anls.class);
    }
    
    private anls() {
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
                final ahbe g;
                if ((g = anls.g) == null) {
                    synchronized (anls.class) {
                        if (anls.g == null) {
                            anls.g = (ahbe)new agzb((agzi)anls.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return anls.a;
            }
            case 4: {
                return new agza((agzi)anls.a);
            }
            case 3: {
                return new anls();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anls.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1009\u0002", new Object[] { "c", "d", "e", "f" });
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

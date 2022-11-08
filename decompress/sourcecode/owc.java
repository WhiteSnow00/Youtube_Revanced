// 
// Decompiled by Procyon v0.6.0
// 

public enum owc
{
    a("COMPONENT_MATERIALIZATION", 0, "ComponentMaterialization"), 
    b("TEMPLATE_FETCHING", 1, "TemplateFetching"), 
    c("TEMPLATE_RESOLUTION", 2, "TemplateResolution"), 
    d("PB_TO_FB", 3, "PbToFb"), 
    e("FIRST_ROOT_PREPARATION", 4, "FirstRootPreparation"), 
    f("FIRST_ROOT_MATERIALIZATION", 5, "FirstRootMaterialization"), 
    g("FIRST_ROOT_MEASUREMENT", 6, "FirstRootMeasurement"), 
    h("ROOT_MOUNTING", 7, "RootMounting"), 
    i("COMMAND_EXECUTION", 8, "CommandExecution"), 
    j("NATIVE_LIBRARY_LOAD", 9, "NativeLibLoading"), 
    k("NATIVE_LIBRARY_CHECK", 10, "NativeLibChecking"), 
    l("UNKNOWN", 11, "Unknown");
    
    public final String m;
    
    private owc(final String s, final int n, final String m) {
        this.m = m;
    }
}

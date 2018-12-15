package com.wensir.project.service.wcs;

import com.wensir.project.common.ServerResponse;

public interface IConfigWcsService {

    ServerResponse selectConfigWcs(String key);

    ServerResponse updateConfigWcs(String key, String value);
}

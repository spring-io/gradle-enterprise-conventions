/*
 * Copyright 2020-2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.spring.develocity.conventions.gradle;

import com.gradle.develocity.agent.gradle.DevelocityConfiguration;
import io.spring.develocity.conventions.core.ConfigurableDevelocity;

/**
 * {@link ConfigurableDevelocity} implementation for Gradle builds.
 *
 * @author Andy Wilkinson
 */
class GradleConfigurableDevelocity implements ConfigurableDevelocity {

	private final DevelocityConfiguration develocity;

	GradleConfigurableDevelocity(DevelocityConfiguration develocity) {
		this.develocity = develocity;
	}

	@Override
	public String getServer() {
		return this.develocity.getServer().getOrNull();
	}

	@Override
	public void setServer(String server) {
		this.develocity.getServer().set(server);
	}

}

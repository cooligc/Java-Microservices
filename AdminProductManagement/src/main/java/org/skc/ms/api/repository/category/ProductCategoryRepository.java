package org.skc.ms.api.repository.category;

import org.skc.ms.model.product.category.ProductCategory;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "category", path = "category")
public interface ProductCategoryRepository extends PagingAndSortingRepository<ProductCategory,Long>{
}
